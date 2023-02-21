package com.itcast.wuhan.controller.admin;

import com.itcast.wuhan.pojo.entity.IntegralGrade;
import com.itcast.wuhan.exception.Assert;
import com.itcast.wuhan.result.R;
import com.itcast.wuhan.result.ResponseEnum;
import com.itcast.wuhan.service.IntegralGradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 借款人上传资源表 前端控制器
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
@Api(tags = "积分等级管理")
//@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;

    @ApiOperation("积分等级列表")
    @GetMapping("/list")
    public R listAll(){
        List<IntegralGrade> list = integralGradeService.list();
        return R.ok().data("list", list);
    }

    @ApiOperation(value = "根据id删除积分等级", notes="逻辑删除")
    @DeleteMapping("/remove/{id}")
    public R removeById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id){
        boolean result = integralGradeService.removeById(id);
        if(result){
            //return R.setResult(ResponseEnum.UPLOAD_ERROR);
            return R.ok().message("删除成功");
        }else{
            return R.error().message("删除失败");
        }
    }

    @ApiOperation("新增积分等级")
    @PostMapping("/save")
    public R save(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.save(integralGrade);
        Assert.notNull(integralGrade.getBorrowAmount(), ResponseEnum.BORROW_AMOUNT_NULL_ERROR);
        if (result) {
            return R.ok().message("保存成功");
        } else {
            return R.error().message("保存失败");
        }
    }

    @ApiOperation("根据id获取积分等级")
    @GetMapping("/get/{id}")
    public R getById(
            @ApiParam(value = "数据id", required = true, example = "1")
            @PathVariable Long id
    ){
        IntegralGrade integralGrade = integralGradeService.getById(id);
        if(integralGrade != null){
            return R.ok().data("record", integralGrade);
        }else{
            return R.error().message("数据不存在");
        }
    }

    @ApiOperation("更新积分等级")
    @PutMapping("/update")
    public R updateById(
            @ApiParam(value = "积分等级对象", required = true)
            @RequestBody IntegralGrade integralGrade){
        boolean result = integralGradeService.updateById(integralGrade);
        if(result){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }
}

