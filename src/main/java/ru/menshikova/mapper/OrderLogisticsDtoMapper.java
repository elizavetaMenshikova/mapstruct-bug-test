package ru.menshikova.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.menshikova.dto.EmployeeDto;
import ru.menshikova.dto.OrderLogisticsDto;
import ru.menshikova.dto.OrderLogisticsFlowDto;

@Mapper
public interface OrderLogisticsDtoMapper {

    String SPACE_SEPARATOR = " ";

    @Mappings({
            @Mapping(target = "operator.operatorInfo.vdaId", source = "dto.operationLog.userId"),
            @Mapping(target = "operator.operatorInfo.phone", source = "dto.employeeDto.login"),
            @Mapping(target = "operator.operatorInfo.fullName", expression = "java(getFullName(orderLogisticsFlowDto.getEmployeeDto()))"),
    })
    OrderLogisticsDto map(OrderLogisticsFlowDto dto);

    default String getFullName(EmployeeDto employeeDto) {
        return (employeeDto.getSurname() + SPACE_SEPARATOR + employeeDto.getName() + SPACE_SEPARATOR + employeeDto.getPatronymic()).trim();
    }
}
