package ru.menshikova.dto;

public class OperatorInfo {
    private String vdaId;
    private String fullName;
    private String phone;

    public OperatorInfo() {
    }

    public String getVdaId() {
        return this.vdaId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setVdaId(String vdaId) {
        this.vdaId = vdaId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OperatorInfo)) return false;
        final OperatorInfo other = (OperatorInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$vdaId = this.getVdaId();
        final Object other$vdaId = other.getVdaId();
        if (this$vdaId == null ? other$vdaId != null : !this$vdaId.equals(other$vdaId)) return false;
        final Object this$fullName = this.getFullName();
        final Object other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OperatorInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $vdaId = this.getVdaId();
        result = result * PRIME + ($vdaId == null ? 43 : $vdaId.hashCode());
        final Object $fullName = this.getFullName();
        result = result * PRIME + ($fullName == null ? 43 : $fullName.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        return result;
    }

    public String toString() {
        return "OperatorInfo(vdaId=" + this.getVdaId() + ", fullName=" + this.getFullName() + ", phone=" + this.getPhone() + ")";
    }

}
