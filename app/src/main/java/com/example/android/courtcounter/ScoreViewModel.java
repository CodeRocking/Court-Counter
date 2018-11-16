package com.example.android.courtcounter;
import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {
    // Tracks the score for Team A
    public int scoreTeamA = 0;

    // Tracks the score for Team B
    public int scoreTeamB = 0;
}

/*
Configuration 'compile' is obsolete and has been replaced with 'implementation' and 'api'.
        It will be removed at the end of 2018. For more information see: http://d.android.com/r/tools/update-dependency-configurations.html

        The specified Android SDK Build Tools version (24.0.2) is ignored, as it is below the minimum supported version (28.0.3) for Android Gradle Plugin 3.2.1.
        Android SDK Build Tools 28.0.3 will be used.
        To suppress this warning, remove "buildToolsVersion '24.0.2'" from your build.gradle file, as each version of the Android Gradle Plugin now has a default version of the build tools.
        Update Build Tools version and sync project
        Open File
*/


//  The versions of the Android Gradle plugin and Gradle are not compatible.
//Unknown host 'jcenter.bintray.com'. You may need to adjust the proxy settings in Gradle.
//No cached version of com.android.tools.build:gradle:3.2.1 available for offline mode.
  //      Disable Gradle 'offline mode' and sync project

//  Enable Gradle 'offline mode' and sync project
//  Learn about configuring HTTP proxies in Gradle

    //The specified Android SDK Build Tools version (24.0.2) is ignored, as it is below the minimum supported version (28.0.3) for Android Gradle Plugin 3.2.1.
    //    Android SDK Build Tools 28.0.3 will be used.

// def lifecycle_version = "1.1.0"
// ViewModel and LiveData
// implementation "android.arch.lifecycle:extensions:$lifecycle_version"
//if not using java 8,use the following line
//    annotationProcessor "android.arch.lifecycle:compiler:$lifecycle_version"
//if using java 8,ignore above line and add the following line
//  implementation "android.arch.lifecycle:common-java8:$lifecycle_version"
//  implementation "android.arch.lifecycle:viewmodel:$lifecycle_version"

//    implementation "android.arch.lifecycle:extensions:1.1.1"


 // maven {
//            url 'https://maven.google.com'
//        }
/*
#Sun Nov 11 19:38:02 EST 2018
        distributionBase=GRADLE_USER_HOME
        distributionPath=wrapper/dists
        zipStoreBase=GRADLE_USER_HOME
        zipStorePath=wrapper/dists
        #// distributionUrl=https\://services.gradle.org/distributions/gradle-4.6-all.zip
        distributionUrl=https\://services.gradle.org/distributions/gradle-2.14.1-all.zip
        #distributionUrl=https\://services.gradle.org/distributions/gradle-3.2.1-all.zip
*/

