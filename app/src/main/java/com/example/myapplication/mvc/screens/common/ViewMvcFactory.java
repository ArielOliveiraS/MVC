package com.example.myapplication.mvc.screens.common;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.myapplication.mvc.screens.common.dialogs.promptdialog.PromptViewMvc;
import com.example.myapplication.mvc.screens.common.dialogs.promptdialog.PromptViewMvcImpl;
import com.example.myapplication.mvc.screens.common.navdrawer.NavDrawerHelper;
import com.example.myapplication.mvc.screens.common.navdrawer.NavDrawerViewMvc;
import com.example.myapplication.mvc.screens.common.navdrawer.NavDrawerViewMvcImpl;
import com.example.myapplication.mvc.screens.common.toolbar.ToolbarViewMvc;
import com.example.myapplication.mvc.screens.questiondetails.QuestionDetailsViewMvc;
import com.example.myapplication.mvc.screens.questiondetails.QuestionDetailsViewMvcImpl;
import com.example.myapplication.mvc.screens.questionslist.QuestionsListViewMvc;
import com.example.myapplication.mvc.screens.questionslist.QuestionsListViewMvcImpl;
import com.example.myapplication.mvc.screens.questionslist.questionslistitem.QuestionsListItemViewMvc;
import com.example.myapplication.mvc.screens.questionslist.questionslistitem.QuestionsListItemViewMvcImpl;

public class ViewMvcFactory {

    private final LayoutInflater mLayoutInflater;
    private final NavDrawerHelper mNavDrawerHelper;

    public ViewMvcFactory(LayoutInflater layoutInflater, NavDrawerHelper navDrawerHelper) {
        mLayoutInflater = layoutInflater;
        mNavDrawerHelper = navDrawerHelper;
    }

    public QuestionsListViewMvc getQuestionsListViewMvc(@Nullable ViewGroup parent) {
        return new QuestionsListViewMvcImpl(mLayoutInflater, parent, mNavDrawerHelper, this);
    }

    public QuestionsListItemViewMvc getQuestionsListItemViewMvc(@Nullable ViewGroup parent) {
        return new QuestionsListItemViewMvcImpl(mLayoutInflater, parent);
    }

    public QuestionDetailsViewMvc getQuestionDetailsViewMvc(@Nullable ViewGroup parent) {
        return new QuestionDetailsViewMvcImpl(mLayoutInflater, parent, this);
    }

    public ToolbarViewMvc getToolbarViewMvc(@Nullable ViewGroup parent) {
        return new ToolbarViewMvc(mLayoutInflater, parent);
    }

    public NavDrawerViewMvc getNavDrawerViewMvc(@Nullable ViewGroup parent) {
        return new NavDrawerViewMvcImpl(mLayoutInflater, parent);
    }

    public PromptViewMvc getPromptViewMvc(@Nullable ViewGroup parent) {
        return new PromptViewMvcImpl(mLayoutInflater, parent);
    }
}
