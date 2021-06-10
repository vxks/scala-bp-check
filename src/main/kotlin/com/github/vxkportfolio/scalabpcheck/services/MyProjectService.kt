package com.github.vxkportfolio.scalabpcheck.services

import com.github.vxkportfolio.scalabpcheck.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
