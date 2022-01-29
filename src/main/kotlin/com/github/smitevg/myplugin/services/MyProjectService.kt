package com.github.smitevg.myplugin.services

import com.intellij.openapi.project.Project
import com.github.smitevg.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
