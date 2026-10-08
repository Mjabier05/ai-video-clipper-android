package com.mjabier.videoclipper.data

data class VideoProject(
    val id: String,
    val name: String,
    val sourceUri: String,
    val durationMs: Long = 0L,
    val segments: List<ClipSegment> = emptyList()
)

