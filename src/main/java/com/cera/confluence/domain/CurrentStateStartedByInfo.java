package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentStateStartedByInfo {

    private String userName;

    private String displayName;

    private ProfilePicture profilePicture;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "CurrentStateStartedByInfo [userName=" + userName + ", displayName=" + displayName + ", profilePicture="
                + profilePicture + "]";
    }
}
