/*
 * Copyright (c) 2014, Francis Galiegue (fgaliegue@gmail.com)
 *
 * This software is dual-licensed under:
 *
 * - the Lesser General Public License (LGPL) version 3.0 or, at your option, any
 *   later version;
 * - the Apache Software License (ASL) version 2.0.
 *
 * The text of both licenses is available under the src/resources/ directory of
 * this project (under the names LGPL-3.0.txt and ASL-2.0.txt respectively).
 *
 * Direct link to the sources:
 *
 * - LGPL 3.0: https://www.gnu.org/licenses/lgpl-3.0.txt
 * - ASL 2.0: http://www.apache.org/licenses/LICENSE-2.0.txt
 */

/**
 * Automatic message bundle loading support
 *
 * <p>In order to use the loading support, all you need to do is provide an
 * implementation of
 * {@link com.github.fge.msgsimple.load.MessageBundleLoader}. Then, to load
 * (and cache) the message bundle, it is as simple as:</p>
 *
 * <pre>
 *     final MessageBundle bundle
 *         = MessageBundles.getBundle(MyFirstBundle.class);
 * </pre>
 */
package com.github.fge.msgsimple.load;