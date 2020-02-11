package com.example.myapplication.mvc.screens.common.controllers;

public interface BackPressedListener {
    /**
     *
     * @return
     * true se o ouvinte manipulou o backPress; false caso contrário
     */
    boolean onBackPressed();
}
