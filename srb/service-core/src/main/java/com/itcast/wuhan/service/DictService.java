package com.itcast.wuhan.service;

import com.itcast.wuhan.pojo.entity.Dict;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itcast.wuhan.pojo.dto.ExcelDictDTO;

import java.io.InputStream;
import java.util.List;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface DictService extends IService<Dict> {
    //从excel里面导入数据方法
    void importData(InputStream inputStream);

    //解析Excel数据
    List<ExcelDictDTO> listDictData();

    //树形表格Excel内容数据查询
    List<Dict> listByParentId(Long parentId);

    //根据编码获取数据字典
    List<Dict> findByDictCode(String dictCode);

    //通过父类ID获得数据字典和数据值
    String getNameByParentDictCodeAndValue(String dictCode, Integer value);
}
