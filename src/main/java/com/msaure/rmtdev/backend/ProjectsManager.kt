package com.msaure.rmtdev.backend

class ProjectsManager {

    fun getActiveProjects(): List<Project> {
        return listOf(Project("bankdingens"), Project("wicketjpa"), Project("rmtdev"))
    }
}