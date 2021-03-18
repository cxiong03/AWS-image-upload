package com.codewithchang.awsimageupload.datastore;

import com.codewithchang.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a343e4af-0af2-43e4-b6a0-1f512d2072ab"), "colesmith", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("604cdea9-09f4-4834-83a9-600c6f590eac"), "alexagreen", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
