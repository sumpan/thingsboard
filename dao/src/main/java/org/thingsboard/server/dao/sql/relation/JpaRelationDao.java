/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.sql.relation;

import com.google.common.util.concurrent.ListenableFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.thingsboard.server.common.data.EntityType;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.page.TimePageLink;
import org.thingsboard.server.common.data.relation.EntityRelation;
import org.thingsboard.server.common.data.relation.RelationTypeGroup;
import org.thingsboard.server.dao.relation.RelationDao;

import java.util.List;

/**
 * Created by Valerii Sosliuk on 5/29/2017.
 */
@Slf4j
@Component
@ConditionalOnProperty(prefix = "sql", value = "enabled", havingValue = "true", matchIfMissing = false)
public class JpaRelationDao implements RelationDao {


    @Override
    public ListenableFuture<List<EntityRelation>> findAllByFrom(EntityId from, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<List<EntityRelation>> findAllByFromAndType(EntityId from, String relationType, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<List<EntityRelation>> findAllByTo(EntityId to, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<List<EntityRelation>> findAllByToAndType(EntityId to, String relationType, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<Boolean> checkRelation(EntityId from, EntityId to, String relationType, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<Boolean> saveRelation(EntityRelation relation) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<Boolean> deleteRelation(EntityRelation relation) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<Boolean> deleteRelation(EntityId from, EntityId to, String relationType, RelationTypeGroup typeGroup) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<Boolean> deleteOutboundRelations(EntityId entity) {
        // TODO: Implement
        return null;
    }

    @Override
    public ListenableFuture<List<EntityRelation>> findRelations(EntityId from, String relationType, RelationTypeGroup typeGroup, EntityType toType, TimePageLink pageLink) {
        // TODO: Implement
        return null;
    }
}