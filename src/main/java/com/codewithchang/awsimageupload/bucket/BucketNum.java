package com.codewithchang.awsimageupload.bucket;

public enum BucketNum {

    PROFILE_IMAGE("codewithchang-image-upload-123");

    private final String bucketName;

    BucketNum(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
