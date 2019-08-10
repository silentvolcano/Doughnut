package com.doughnut.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.doughnut.R;


public class PrivateKeyFragment extends BaseFragment implements View.OnClickListener{
    private RelativeLayout mLayoutManageWallet;
    private RelativeLayout mLayoutRecordTransaction;
    private RelativeLayout mLayoutNotification;
    private RelativeLayout mLayoutHelp;
    private RelativeLayout mLayoutAbout;
    private RelativeLayout mLayoutLanguage;

    public static PrivateKeyFragment newInstance() {
        Bundle args = new Bundle();
        PrivateKeyFragment fragment = new PrivateKeyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_private_key, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    @Override
    public void onResume() {
        super.onResume();
//        mLayoutManageWallet.setClickable(true);
//        mLayoutRecordTransaction.setClickable(true);
//        mLayoutNotification.setClickable(true);
//        mLayoutHelp.setClickable(true);
//        mLayoutAbout.setClickable(true);
//        mLayoutLanguage.setClickable(true);
    }

    @Override
    public void onClick(View view) {
//        if (view == mLayoutManageWallet) {
//            mLayoutManageWallet.setClickable(false);
//            ManageWalletActivity.startModifyWalletActivity(getActivity());
//        } else if (view == mLayoutRecordTransaction) {
//            mLayoutRecordTransaction.setClickable(false);
//            TransactionRecordActivity.startTransactionRecordActivity(getActivity());
//        } else if (view == mLayoutNotification) {
//            mLayoutNotification.setClickable(false);
//            TransactionRecordActivity.startTransactionRecordActivity(getActivity());
//        } else if (view == mLayoutHelp) {
//            mLayoutHelp.setClickable(false);
//            WebBrowserActivity.startWebBrowserActivity(getActivity(), getString(R.string.titleBar_help_center), Constant.help_url);
//        } else if (view == mLayoutAbout) {
//            mLayoutAbout.setClickable(false);
//            AboutActivity.startAboutActivity(getActivity());
//        } else if (view == mLayoutLanguage) {
//            mLayoutLanguage.setClickable(false);
//            LanguageActivity.startLanguageActivity(getActivity());
//        }
    }

    private void initView(View view) {

//        mLayoutManageWallet = view.findViewById(R.id.layout_manage_wallet);
//        mLayoutRecordTransaction = view.findViewById(R.id.layout_transaction_record);
//        mLayoutNotification = view.findViewById(R.id.layout_notication);
//        mLayoutHelp = view.findViewById(R.id.layout_help);
//        mLayoutAbout = view.findViewById(R.id.layout_about);
//        mLayoutLanguage = view.findViewById(R.id.layout_language);
//
//        mLayoutManageWallet.setOnClickListener(this);
//        mLayoutRecordTransaction.setOnClickListener(this);
//        mLayoutNotification.setOnClickListener(this);
//        mLayoutHelp.setOnClickListener(this);
//        mLayoutAbout.setOnClickListener(this);
//        mLayoutLanguage.setOnClickListener(this);
    }
}