package com.codepath.apps.mysimpletweets.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by labadmin on 8/6/17.
 */

public class User implements Serializable {

    private String name;
    private long uid;
    private String screenName;
    private String profileImageUrl;
    private String tagline;
    private int followersCount;
    private int followingCount;


    public String getName() {
        return name;
    }

    public long getUid() {
        return uid;
    }

    public String getScreenName() {
        return screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getTagline() { return tagline; }

    public int getFollowersCount() { return followersCount; }

    public int getFriendsCount() { return followingCount; }

    public static User fromJSON(JSONObject json){
        User user = new User();
        try {
            user.name = json.getString("name");
            user.uid = json.getLong("id");
            user.screenName = json.getString("screen_name");
            user.profileImageUrl = json.getString("profile_image_url");
            user.tagline = json.getString("desciption");
            user.followersCount = json.getInt("followers_count");
            user.followingCount = json.getInt("friends_count");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return user;
    }


}
