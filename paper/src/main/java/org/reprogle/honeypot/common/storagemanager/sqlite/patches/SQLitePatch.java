/*
 * Honeypot is a tool for griefing auto-moderation
 *
 * Copyright TerrorByte (c) 2024
 * Copyright Honeypot Contributors (c) 2024
 *
 * This program is free software: You can redistribute it and/or modify it under the terms of the Mozilla Public License 2.0
 * as published by the Mozilla under the Mozilla Foundation.
 *
 * This program is distributed in the hope that it will be useful, but provided on an "as is" basis,
 * without warranty of any kind, either expressed, implied, or statutory, including, without limitation,
 * warranties that the Covered Software is free of defects, merchantable, fit for a particular purpose or non-infringing.
 * See the MPL 2.0 license for more details.
 *
 * For a full copy of the license in its entirety, please visit <https://www.mozilla.org/en-US/MPL/2.0/>
 */

package org.reprogle.honeypot.common.storagemanager.sqlite.patches;

import org.reprogle.honeypot.common.utils.HoneypotLogger;

import java.sql.SQLException;
import java.sql.Statement;

public interface SQLitePatch {

    /**
     * The patch to apply
     * @param s The statement of the connection
     * @param logger The logger to log any potential errors
     * @throws SQLException Thrown if an error occurs
     */
    void update(Statement s, HoneypotLogger logger) throws SQLException;

    /**
     * The user_version pragma that the database patch applies to. This allows us to ignore unnecessary patches
     * @return user_version of patch
     */
    int patchedIn();
}