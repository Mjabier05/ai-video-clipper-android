package com.mjabier.videoclipper.data

data class ClipSegment(
    val startMs: Long,
    val endMs: Long,
    val label: String
)

data class VideoProject(
    val id: String,
    val name: String,
    val sourceUri: String,
    val durationMs: Long = 0L,
    val segments: List<ClipSegment> = emptyList()
)
