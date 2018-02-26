package com.rodvar.kotlinbase.feature.bottomnavigation;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;

import com.rodvar.kotlinbase.BaseInstrumentedTest;
import com.rodvar.kotlinbase.R;
import com.rodvar.kotlinbase.feature.SplashActivity;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

/**
 * Created by rodvar on 24/11/17.
 */
@Ignore("Until there is a clear defintion of the UI navigation and this is to be either used or disposed")
@LargeTest
public class MainMenuUITest extends BaseInstrumentedTest {

    @Rule
    public ActivityTestRule<SplashActivity> mActivityTestRule = new ActivityTestRule<>(SplashActivity.class);

    @Test
    public void shouldShowUpWithFirstMenuOptionClicked() {
        ViewInteraction mainTextView = onView(
                allOf(withId(R.id.main_text), withId(R.id.main_text),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_container),
                                        0),
                                0),
                        isDisplayed()));
        mainTextView.check(matches(withText(getString(R.string.a_txt))));

        ViewInteraction titleTextView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.action_bar),
                                childAtPosition(
                                        withId(R.id.action_bar_container),
                                        0)),
                        0),
                        isDisplayed()));
        titleTextView.check(matches(withText(getString(R.string.a_title))));
    }

    @Test
    public void shouldChangeContentAndTitleAccordinglyWhenClickingBottomMenu() {
        // Accounts Menu
        ViewInteraction bottomNavigationItemView = onView(allOf(withId(R.id.menu_item_transfer), isDisplayed()));
        bottomNavigationItemView.perform(click());

        ViewInteraction mainTextView = onView(
                allOf(withId(R.id.main_text), withId(R.id.main_text),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_container),
                                        0),
                                0),
                        isDisplayed()));
        mainTextView.check(matches(withText(getString(R.string.transfer_txt))));

        ViewInteraction titleTextView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.action_bar),
                                childAtPosition(
                                        withId(R.id.action_bar_container),
                                        0)),
                        0),
                        isDisplayed()));
        titleTextView.check(matches(withText(getString(R.string.some_action_menu_title))));

        // Transfer Menu
        bottomNavigationItemView = onView(allOf(withId(R.id.menu_item_accounts), isDisplayed()));
        bottomNavigationItemView.perform(click());

        mainTextView = onView(
                allOf(withId(R.id.main_text), withId(R.id.main_text),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_container),
                                        0),
                                0),
                        isDisplayed()));
        mainTextView.check(matches(withText(getString(R.string.a_txt))));

        titleTextView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.action_bar),
                                childAtPosition(
                                        withId(R.id.action_bar_container),
                                        0)),
                        0),
                        isDisplayed()));
        titleTextView.check(matches(withText(getString(R.string.a_title))));

        // More Options Menu
        bottomNavigationItemView = onView(allOf(withId(R.id.menu_item_more), isDisplayed()));
        bottomNavigationItemView.perform(click());

        mainTextView = onView(
                allOf(withId(R.id.main_text), withId(R.id.main_text),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_container),
                                        0),
                                0),
                        isDisplayed()));
        mainTextView.check(matches(withText(getString(R.string.more_options_menu_txt))));

        titleTextView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.action_bar),
                                childAtPosition(
                                        withId(R.id.action_bar_container),
                                        0)),
                        0),
                        isDisplayed()));
        titleTextView.check(matches(withText(getString(R.string.more_options_menu_title))));

    }
}
