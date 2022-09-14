package com.onboarding.app

class MyLibrary {

    @Deprecated("this method will not be maintain again", ReplaceWith("getUserName()", "com.onboarding.app.library.MyLibrary2.getUserName"))
    public fun getName(): String {
        return ""
    }

}