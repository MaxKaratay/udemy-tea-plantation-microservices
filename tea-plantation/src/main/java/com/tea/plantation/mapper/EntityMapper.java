package com.tea.plantation.mapper;

public interface EntityMapper<Entity, Dto> {
    Dto toDto(Entity entity);
    Entity toEntity(Dto dto);
}
