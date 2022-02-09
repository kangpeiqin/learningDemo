package com.example.distributedLock.entity;

import com.example.distributedLock.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author kpq
 * @since 2022-02-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FilmActor extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Integer actorId;

    private Integer filmId;


}