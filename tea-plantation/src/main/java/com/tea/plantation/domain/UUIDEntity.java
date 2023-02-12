package com.tea.plantation.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
import java.util.UUID;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public abstract class UUIDEntity extends Auditable {
    //Entity with universally unique identifier that should be unique across services, let's believe it will be ;)
    @Getter
    @Setter
    private UUID uuid;

    public UUIDEntity(Instant createDate, Instant updateDate, Integer version) {
        super(createDate, updateDate, version);
        uuid = UUID.randomUUID();
    }

    public UUIDEntity() {
        uuid = UUID.randomUUID();
    }
}
