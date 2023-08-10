//  Copyright 2023 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.

package org.finos.legend.pure.code.core;

import org.eclipse.collections.api.RichIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.finos.legend.engine.pure.code.core.PureCoreExtension;
import org.finos.legend.pure.generated.Root_meta_pure_extension_Extension;
import org.finos.legend.pure.m3.execution.ExecutionSupport;

import java.lang.reflect.Method;

public class FlatDataJavaBindingPureCoreExtension implements PureCoreExtension
{
    @Override
    public RichIterable<? extends Root_meta_pure_extension_Extension> extraPureCoreExtensions(ExecutionSupport es)
    {
        try
        {
            Class<?> cl = Class.forName("org.finos.legend.pure.generated.core_external_format_flatdata_java_platform_binding_legendJavaPlatformBinding_descriptor");
            Method m = cl.getMethod("Root_meta_external_format_flatdata_executionPlan_platformBinding_legendJava_flatDataExtensionJavaPlatformBinding__Extension_1_", ExecutionSupport.class);
            Root_meta_pure_extension_Extension ext = (Root_meta_pure_extension_Extension) m.invoke(null, es);
            return Lists.mutable.with(ext);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            // Silent at build time
            return Lists.mutable.empty();
        }
    }
}
