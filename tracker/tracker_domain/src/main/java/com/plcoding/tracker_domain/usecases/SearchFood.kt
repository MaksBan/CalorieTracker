package com.plcoding.tracker_domain.usecases

import com.plcoding.tracker_domain.model.TrackableFood
import com.plcoding.tracker_domain.repository.TrackerRepository

class SearchFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(
        query: String,
        page: Int = 1,
        pageSize: Int = 40
    ): Result<List<TrackableFood>>{

        return if(query.isNotBlank())
            repository.searchFood(query.trim(), page, pageSize)
        else
            Result.success(emptyList())
    }
}