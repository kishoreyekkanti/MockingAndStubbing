package dao;

import models.*;

import java.util.Arrays;
import java.util.List;

/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 * <p/>
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 * <p/>
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
public class FeedDao {

    public List<Feed> getFeeds(User user) {
        List<Feed> feeds = Arrays.asList(buildFeed("http://abcd.com"), buildFeed("http://xyz.com"));
        return feeds;
    }

    private Feed buildFeed(String url) {
        Feed feed = new Feed();
        feed.setCommaSepratedTags("tech,screencast,java");
        feed.setUrl(url);
        return feed;
    }
}
