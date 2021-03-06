package com.kanyideveloper.dlight.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import com.kanyideveloper.dlight.domain.model.Repo

@Entity(tableName = "user_repos_table", indices = [Index(value = ["login"], unique = true)])
data class UserReposEntity(
    val login: String,
    val repos: List<Repo>,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
)