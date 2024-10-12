package ru.menshikova.dto;

public class Operator {
    private OperatorInfo operatorInfo;

    public Operator() {
    }

    public OperatorInfo getOperatorInfo() {
        return this.operatorInfo;
    }

    public void setOperatorInfo(OperatorInfo operatorInfo) {
        this.operatorInfo = operatorInfo;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Operator)) return false;
        final Operator other = (Operator) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$operatorInfo = this.getOperatorInfo();
        final Object other$operatorInfo = other.getOperatorInfo();
        if (this$operatorInfo == null ? other$operatorInfo != null : !this$operatorInfo.equals(other$operatorInfo))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Operator;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $operatorInfo = this.getOperatorInfo();
        result = result * PRIME + ($operatorInfo == null ? 43 : $operatorInfo.hashCode());
        return result;
    }

    public String toString() {
        return "Operator(operatorInfo=" + this.getOperatorInfo() + ")";
    }
}
