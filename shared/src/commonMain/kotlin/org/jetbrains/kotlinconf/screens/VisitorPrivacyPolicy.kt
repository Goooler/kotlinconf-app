package org.jetbrains.kotlinconf.screens

import androidx.compose.runtime.Composable
import kotlinconfapp.shared.generated.resources.Res
import kotlinconfapp.shared.generated.resources.privacy_policy_for_visitors
import kotlinconfapp.shared.generated.resources.privacy_policy_for_visitors_title
import kotlinconfapp.shared.generated.resources.privacy_policy_for_visitors_version
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.kotlinconf.MarkdownScreenWithTitle

@OptIn(ExperimentalResourceApi::class)
@Composable
fun VisitorPrivacyPolicy(onBack: () -> Unit) {
    MarkdownScreenWithTitle(
        title = stringResource(Res.string.privacy_policy_for_visitors),
        header = stringResource(Res.string.privacy_policy_for_visitors_title),
        subheader = stringResource(Res.string.privacy_policy_for_visitors_version),
        loadText = { Res.readBytes("files/visitors-privacy-policy.md") },
        onBack = onBack
    )
}
