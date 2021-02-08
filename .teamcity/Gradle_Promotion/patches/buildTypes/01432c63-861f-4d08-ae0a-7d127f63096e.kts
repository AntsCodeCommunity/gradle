package Gradle_Promotion.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '01432c63-861f-4d08-ae0a-7d127f63096e' (id = 'Gradle_Promotion_MasterNightly')
accordingly, and delete the patch script.
*/
changeBuildType(uuid("01432c63-861f-4d08-ae0a-7d127f63096e")) {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}