package ru.menshikova.dto;

import java.util.UUID;

public class OrderLogisticsDto {
    private UUID creditVdaId;
    private String proposalId;
    private Operator operator;

    public OrderLogisticsDto() {
    }

    public UUID getCreditVdaId() {
        return this.creditVdaId;
    }

    public String getProposalId() {
        return this.proposalId;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public void setCreditVdaId(UUID creditVdaId) {
        this.creditVdaId = creditVdaId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderLogisticsDto)) return false;
        final OrderLogisticsDto other = (OrderLogisticsDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$creditVdaId = this.getCreditVdaId();
        final Object other$creditVdaId = other.getCreditVdaId();
        if (this$creditVdaId == null ? other$creditVdaId != null : !this$creditVdaId.equals(other$creditVdaId))
            return false;
        final Object this$proposalId = this.getProposalId();
        final Object other$proposalId = other.getProposalId();
        if (this$proposalId == null ? other$proposalId != null : !this$proposalId.equals(other$proposalId))
            return false;
        final Object this$operator = this.getOperator();
        final Object other$operator = other.getOperator();
        if (this$operator == null ? other$operator != null : !this$operator.equals(other$operator)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderLogisticsDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $creditVdaId = this.getCreditVdaId();
        result = result * PRIME + ($creditVdaId == null ? 43 : $creditVdaId.hashCode());
        final Object $proposalId = this.getProposalId();
        result = result * PRIME + ($proposalId == null ? 43 : $proposalId.hashCode());
        final Object $operator = this.getOperator();
        result = result * PRIME + ($operator == null ? 43 : $operator.hashCode());
        return result;
    }

    public String toString() {
        return "OrderLogisticsDto(creditVdaId=" + this.getCreditVdaId() + ", proposalId=" + this.getProposalId() + ", operator=" + this.getOperator() + ")";
    }
}
