/*******************************************************************************
 * Copyright 2011 Joachim Ansorg, mail@ansorg-it.com
 * File: BashIdentifierUtil.java, Class: BashIdentifierUtil
 * Last modified: 2011-04-30 16:33
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
 ******************************************************************************/

package com.ansorgit.plugins.bash.lang.psi.util;

import org.apache.commons.lang.StringUtils;

/**
 * User: jansorg
 * Date: Feb 8, 2010
 * Time: 9:55:14 PM
 */
public class BashIdentifierUtil {
    public static boolean isValidIdentifier(String name) {
        return StringUtils.stripToNull(name) != null && !name.contains(" ");
    }

    private BashIdentifierUtil() {
    }
}