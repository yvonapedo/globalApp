package impl;

import mapperImpl.TDepartmentMapperImpl;
import model.TDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DepartmentService;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    
    @Autowired
    private TDepartmentMapperImpl tDepartmentMapper;
    @Override
    public int deleteDepartment(int departmentid) {
        return tDepartmentMapper.deleteByPrimaryKey(departmentid);
    }

    @Override
    public int insertDepartment(TDepartment record) {
        return tDepartmentMapper.insertSelective(record);
    }

    @Override
    public TDepartment selectDepartmentById(int departmentid) {
        return tDepartmentMapper.selectByPrimaryKey(departmentid);
    }

    @Override
    public List<TDepartment> getDepartmentsSelective(TDepartment record) {
        return tDepartmentMapper.selectBySelective(record);
    }

    @Override
    public int updateDepartment(TDepartment record) {
        return tDepartmentMapper.updateByPrimaryKeySelective(record);
    }
}
