/*
 *
 * Copyright (c) 2006-2019, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.core.internal.component;

import com.speedment.runtime.core.component.connectionpool.ConnectionDecorator;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * This {@link ConnectionDecorator} does nothing with the connection and
 * is used as the default ConnectionDecorator.
 */
public class DefaultConnectionDecorator implements ConnectionDecorator {

    @Override
    public void configure(Connection connection) throws SQLException {
       // Do nothing
    }

    @Override
    public void cleanup(Connection connection) throws SQLException {
        // Do nothing
    }

}
