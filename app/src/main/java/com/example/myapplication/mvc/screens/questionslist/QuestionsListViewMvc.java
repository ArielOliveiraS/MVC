package com.example.myapplication.mvc.screens.questionslist;

import com.example.myapplication.mvc.questions.Question;
import com.example.myapplication.mvc.screens.common.views.ObservableViewMvc;


import java.util.List;

public interface QuestionsListViewMvc extends ObservableViewMvc<QuestionsListViewMvc.Listener> {

    public interface Listener {
        void onQuestionClicked(Question question);
    }

    void bindQuestions(List<Question> questions);

    void showProgressIndication();

    void hideProgressIndication();

}
