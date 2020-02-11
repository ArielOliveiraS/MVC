package com.example.myapplication.mvc.screens.questiondetails;

import com.example.myapplication.mvc.questions.QuestionDetails;
import com.example.myapplication.mvc.screens.common.views.ObservableViewMvc;


public interface QuestionDetailsViewMvc extends ObservableViewMvc<QuestionDetailsViewMvc.Listener> {

    public interface Listener {
        void onNavigateUpClicked();
    }

    void bindQuestion(QuestionDetails question);

    void showProgressIndication();

    void hideProgressIndication();
}
