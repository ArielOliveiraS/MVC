package com.example.myapplication.mvc.screens.common.fragmentframehelper;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public interface HierarchicalFragment {
    /**
     * In case of UP navigation when Fragments back-stack is empty, the Fragment returned by this
     * method will be navigated to. If this method returns null, then UP navigation will be
     * delegated to enclosing Activity.
     * @return hierarchical parent Fragment of this Fragment; null this Fragment has no hierarchical
     *         parent
     *
     *
     * No caso de navegação UP quando a pilha de fragmentos estiver vazia, o fragmento retornado por este
     * método. Se este método retornar nulo, a navegação UP será
     * delegado à Activity anexa.
     * @return  hierárquico do fragmento principal deste fragmento; null este fragmento não tem hierarquia
     * pai
     */
    @Nullable
    Fragment getHierarchicalParentFragment();
}
