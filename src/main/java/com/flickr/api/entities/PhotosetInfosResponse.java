/*
 * (C) Copyright 2014 Fabien Barbero.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
package com.flickr.api.entities;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Fabien Barbero
 */
public class PhotosetInfosResponse
        extends JSONResponse
{

    private PhotosetInfos infos;

    @Override
    protected void readObject( JSONObject json )
            throws JSONException
    {
        infos = new PhotosetInfos( json.getJSONObject( "photoset" ) );
    }

    public PhotosetInfos getInfos()
    {
        return infos;
    }

}
