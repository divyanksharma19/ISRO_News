package com.divyankS.apps.isroinfo.repo

import com.divyankS.apps.isroinfo.api.IsroApi
import com.divyankS.apps.isroinfo.model.Launch
import com.divyankS.apps.isroinfo.model.SpaceCraft

class IsroRepo(private val api: IsroApi) {
    suspend fun getLaunches(): List<Launch> {
        return api.getLaunches()
    }
    suspend fun getSpaceCraft(): List<SpaceCraft> {
        return api.getSpaceCraft()
    }
}