/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.server.thrift;

import java.util.List;

import org.apache.thrift.TException;
import org.kaaproject.kaa.server.common.thrift.gen.operations.OperationsThriftService;

public interface NeighborTemplate<V> {

    void process(OperationsThriftService.Iface client, List<V> messages) throws TException;

    void onServerError(String serverId, Exception e);

}
