/*
 * Copyright (c) 2012-2015 VMware, Inc.  All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, without
 * warranties or conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.vmware.identity.interop.ossam;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.win32.W32APITypeMapper;

/**
 * Do not use this class externally.
 * It is intended for internal use by Platform package,
 * but must stay public for interop ...
 */
public class GroupMembersInfoNative extends BaseOsSamNativeStructure
{
    static final int Level = 1;

    //typedef struct _LOCALGROUP_MEMBERS_INFO_1 {
    //    PSID         lgrmi1_sid;
    //    SID_NAME_USE lgrmi1_sidusage;
    //    LPWSTR       lgrmi1_name;
    //} LOCALGROUP_MEMBERS_INFO_1, *PLOCALGROUP_MEMBERS_INFO_1, *LPLOCALGROUP_MEMBERS_INFO_1;

    public Pointer pSid;
    public int sidUsage;
    public String name;

    public GroupMembersInfoNative()
    {
        super();
    }

    public GroupMembersInfoNative(Pointer p)
    {
        super(p);
    }

    @Override
    protected List<String> getFieldOrder()
    {
        return Arrays.asList(new String[] {
                "pSid", "sidUsage", "name"
        });
    }

}
