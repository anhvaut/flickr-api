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
package com.flickr.api;

import com.flickr.api.entities.CameraBrand;
import com.flickr.api.entities.CameraBrandModel;
import com.flickr.api.entities.CameraBrandModelsResponse;
import com.flickr.api.entities.CameraBrandsResponse;
import java.util.List;

/**
 *
 * @author Fabien Barbero
 */
public class CameraService
        extends FlickrService
{

    CameraService( OAuthHandler oauth )
    {
        super( oauth );
    }

    /**
     * Get the camera brands
     *
     * @return The brands
     * @throws FlickrException Error getting the brands
     */
    public List<CameraBrand> getBrands()
            throws FlickrException
    {
        CommandArguments args = new CommandArguments( "flickr.cameras.getBrands" );
        return doGet( args, CameraBrandsResponse.class ).getList();
    }

    /**
     * Retrieve all the models for a given camera brand.
     *
     * @param brand The requested brand
     * @return The models
     * @throws FlickrException Error getting the models
     */
    public List<CameraBrandModel> getBrandModels( CameraBrand brand )
            throws FlickrException
    {
        CommandArguments args = new CommandArguments( "flickr.cameras.getBrandModels" );
        args.addParam( "brand", brand.getId() );
        return doGet( args, CameraBrandModelsResponse.class ).getList();
    }

}
