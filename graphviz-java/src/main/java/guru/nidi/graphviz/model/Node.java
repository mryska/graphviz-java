/*
 * Copyright © 2015 Stefan Niederhauser (nidin@gmx.ch)
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
package guru.nidi.graphviz.model;

import guru.nidi.graphviz.attribute.Attributed;
import guru.nidi.graphviz.attribute.Label;

import javax.annotation.Nullable;

public interface Node extends Attributed<Node>, LinkSource, LinkTarget {
    Label name();

    PortNode port(@Nullable String record);

    PortNode port(@Nullable Compass compass);

    PortNode port(@Nullable String record, @Nullable Compass compass);

    Node link(LinkTarget... targets);

    Node link(String node);

    Node link(String... nodes);
}
