package com.github.mcl0505.templateutil.services

import com.github.mcl0505.templateutil.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
