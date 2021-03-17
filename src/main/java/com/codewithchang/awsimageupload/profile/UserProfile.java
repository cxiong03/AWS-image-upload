package com.codewithchang.awsimageupload.profile;

import java.util.UUID;

public class UserProfile {

    private UUID userProfileId;
    private String userName;
    private String userProfileImageLink; // S3 key

    public UserProfile(UUID userProfileId, String userName, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UUID userProfileId)
}
