package ru.menshikova.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public final class OperationLog {
    private final UUID userId;
    private final UUID sellerPlaceId;
    private final String clientId;
    private final LocalDateTime operationTime;

    OperationLog(UUID userId, UUID sellerPlaceId, String clientId, LocalDateTime operationTime) {
        this.userId = userId;
        this.sellerPlaceId = sellerPlaceId;
        this.clientId = clientId;
        this.operationTime = operationTime;
    }

    public static OperationLogBuilder builder() {
        return new OperationLogBuilder();
    }

    public UUID getUserId() {
        return this.userId;
    }

    public UUID getSellerPlaceId() {
        return this.sellerPlaceId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public LocalDateTime getOperationTime() {
        return this.operationTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OperationLog)) return false;
        final OperationLog other = (OperationLog) o;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$sellerPlaceId = this.getSellerPlaceId();
        final Object other$sellerPlaceId = other.getSellerPlaceId();
        if (this$sellerPlaceId == null ? other$sellerPlaceId != null : !this$sellerPlaceId.equals(other$sellerPlaceId))
            return false;
        final Object this$clientId = this.getClientId();
        final Object other$clientId = other.getClientId();
        if (this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) return false;
        final Object this$operationTime = this.getOperationTime();
        final Object other$operationTime = other.getOperationTime();
        if (this$operationTime == null ? other$operationTime != null : !this$operationTime.equals(other$operationTime))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $sellerPlaceId = this.getSellerPlaceId();
        result = result * PRIME + ($sellerPlaceId == null ? 43 : $sellerPlaceId.hashCode());
        final Object $clientId = this.getClientId();
        result = result * PRIME + ($clientId == null ? 43 : $clientId.hashCode());
        final Object $operationTime = this.getOperationTime();
        result = result * PRIME + ($operationTime == null ? 43 : $operationTime.hashCode());
        return result;
    }

    public String toString() {
        return "OperationLog(userId=" + this.getUserId() + ", sellerPlaceId=" + this.getSellerPlaceId() + ", clientId=" + this.getClientId() + ", operationTime=" + this.getOperationTime() + ")";
    }

    public OperationLogBuilder toBuilder() {
        return new OperationLogBuilder().userId(this.userId).sellerPlaceId(this.sellerPlaceId).clientId(this.clientId).operationTime(this.operationTime);
    }

    public static class OperationLogBuilder {
        private UUID userId;
        private UUID sellerPlaceId;
        private String clientId;
        private LocalDateTime operationTime;

        OperationLogBuilder() {
        }

        public OperationLogBuilder userId(UUID userId) {
            this.userId = userId;
            return this;
        }

        public OperationLogBuilder sellerPlaceId(UUID sellerPlaceId) {
            this.sellerPlaceId = sellerPlaceId;
            return this;
        }

        public OperationLogBuilder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        public OperationLogBuilder operationTime(LocalDateTime operationTime) {
            this.operationTime = operationTime;
            return this;
        }

        public OperationLog build() {
            return new OperationLog(this.userId, this.sellerPlaceId, this.clientId, this.operationTime);
        }

        public String toString() {
            return "OperationLog.OperationLogBuilder(userId=" + this.userId + ", sellerPlaceId=" + this.sellerPlaceId + ", clientId=" + this.clientId + ", operationTime=" + this.operationTime + ")";
        }
    }
}
