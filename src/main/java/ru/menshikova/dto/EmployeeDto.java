package ru.menshikova.dto;

public class EmployeeDto {
    private String tabelNumber;
    private String login;
    private String homerCode;
    private String comment;
    private String regionalCenter;
    private String surname;
    private String name;
    private String patronymic;
/*
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof EmployeeDto)) {
            return false;
        } else {
            EmployeeDto other = (EmployeeDto) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (!super.equals(o)) {
                return false;
            } else {
                label73:
                {
                    Object this$tabelNumber = this.getTabelNumber();
                    Object other$tabelNumber = other.getTabelNumber();
                    if (this$tabelNumber == null) {
                        if (other$tabelNumber == null) {
                            break label73;
                        }
                    } else if (this$tabelNumber.equals(other$tabelNumber)) {
                        break label73;
                    }

                    return false;
                }

                Object this$login = this.getLogin();
                Object other$login = other.getLogin();
                if (this$login == null) {
                    if (other$login != null) {
                        return false;
                    }
                } else if (!this$login.equals(other$login)) {
                    return false;
                }

                label59:
                {
                    Object this$homerCode = this.getHomerCode();
                    Object other$homerCode = other.getHomerCode();
                    if (this$homerCode == null) {
                        if (other$homerCode == null) {
                            break label59;
                        }
                    } else if (this$homerCode.equals(other$homerCode)) {
                        break label59;
                    }

                    return false;
                }

                Object this$comment = this.getComment();
                Object other$comment = other.getComment();
                if (this$comment == null) {
                    if (other$comment != null) {
                        return false;
                    }
                } else if (!this$comment.equals(other$comment)) {
                    return false;
                }

                Object this$regionalCenter = this.getRegionalCenter();
                Object other$regionalCenter = other.getRegionalCenter();
                if (this$regionalCenter == null) {
                    if (other$regionalCenter != null) {
                        return false;
                    }
                } else if (!this$regionalCenter.equals(other$regionalCenter)) {
                    return false;
                }

                return true;
            }
        }
    }


    public int hashCode() {
        int result = super.hashCode();
        Object $tabelNumber = this.getTabelNumber();
        result = result * 59 + ($tabelNumber == null ? 43 : $tabelNumber.hashCode());
        Object $login = this.getLogin();
        result = result * 59 + ($login == null ? 43 : $login.hashCode());
        Object $homerCode = this.getHomerCode();
        result = result * 59 + ($homerCode == null ? 43 : $homerCode.hashCode());
        Object $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        Object $regionalCenter = this.getRegionalCenter();
        result = result * 59 + ($regionalCenter == null ? 43 : $regionalCenter.hashCode());
        return result;
    }*/

    public String getTabelNumber() {
        return this.tabelNumber;
    }

    public String getLogin() {
        return this.login;
    }

    public String getHomerCode() {
        return this.homerCode;
    }

    public String getComment() {
        return this.comment;
    }

    public String getRegionalCenter() {
        return this.regionalCenter;
    }

    public void setTabelNumber(final String tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public void setHomerCode(final String homerCode) {
        this.homerCode = homerCode;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setRegionalCenter(final String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    /*    public String toString() {
        String var10000 = this.getTabelNumber();
        return "EmployeeDto(tabelNumber=" + var10000 + ", login=" + this.getLogin() + ", homerCode=" + this.getHomerCode() + ", comment=" + this.getComment() + ", regionalCenter=" + this.getRegionalCenter() + ")";
    }*/

    public EmployeeDto() {
    }
}
