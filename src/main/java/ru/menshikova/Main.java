package ru.menshikova;

import org.mapstruct.factory.Mappers;
import ru.menshikova.dto.EmployeeDto;
import ru.menshikova.dto.OperationLog;
import ru.menshikova.dto.OrderLogisticsDto;
import ru.menshikova.dto.OrderLogisticsFlowDto;
import ru.menshikova.mapper.OrderLogisticsDtoMapper;

import java.util.UUID;

public class Main {
    private static final OrderLogisticsDtoMapper mapper = Mappers.getMapper(OrderLogisticsDtoMapper.class);

    public static void main(String[] args) {
        UUID uderId = UUID.randomUUID();
        EmployeeDto employeeDto = new EmployeeDto();
        String login = "login";
        employeeDto.setLogin(login);
        OrderLogisticsFlowDto orderLogisticsFlowDto = OrderLogisticsFlowDto.builder()
                .operationLog(OperationLog.builder()
                        .userId(uderId)
                        .build())
                .employeeDto(employeeDto)
                .fullName("fullName")
                .build();

        OrderLogisticsDto result = mapper.map(orderLogisticsFlowDto);

        System.out.println(result);
    }
}