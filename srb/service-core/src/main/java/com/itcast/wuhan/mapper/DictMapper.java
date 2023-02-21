package com.itcast.wuhan.mapper;

import com.itcast.wuhan.pojo.entity.Dict;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itcast.wuhan.pojo.dto.ExcelDictDTO;

import java.util.List;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author wuhan
 * @since 2022-10-13
 */
public interface DictMapper extends BaseMapper<Dict> {
    void insertBatch(List<ExcelDictDTO> list);
}
