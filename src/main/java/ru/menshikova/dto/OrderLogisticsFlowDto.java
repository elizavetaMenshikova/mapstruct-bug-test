package ru.menshikova.dto;

public class OrderLogisticsFlowDto {
    private OperationLog operationLog;
    private EmployeeDto employeeDto;
    private String fullName;

    OrderLogisticsFlowDto(OperationLog operationLog, EmployeeDto employeeDto, String fullName) {
        this.operationLog = operationLog;
        this.employeeDto = employeeDto;
        this.fullName = fullName;
    }

    public static OrderLogisticsFlowDtoBuilder builder() {
        return new OrderLogisticsFlowDtoBuilder();
    }

    public OperationLog getOperationLog() {
        return this.operationLog;
    }

    public EmployeeDto getEmployeeDto() {
        return this.employeeDto;
    }

    public String getFullName() {
        return this.fullName;
    }

    public static class OrderLogisticsFlowDtoBuilder {
        private OperationLog operationLog;
        private EmployeeDto employeeDto;
        private String fullName;

        OrderLogisticsFlowDtoBuilder() {
        }

        public OrderLogisticsFlowDtoBuilder operationLog(OperationLog operationLog) {
            this.operationLog = operationLog;
            return this;
        }

        public OrderLogisticsFlowDtoBuilder employeeDto(EmployeeDto employeeDto) {
            this.employeeDto = employeeDto;
            return this;
        }

        public OrderLogisticsFlowDtoBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public OrderLogisticsFlowDto build() {
            return new OrderLogisticsFlowDto(this.operationLog, this.employeeDto, this.fullName);
        }

        public String toString() {
            return "OrderLogisticsFlowDto.OrderLogisticsFlowDtoBuilder(operationLog=" + this.operationLog + ", employeeDto=" + this.employeeDto + ", fullName=" + this.fullName + ")";
        }
    }
}
