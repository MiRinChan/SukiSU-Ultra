package _generated._ramcosta._composedestinations._moduleregistry

import com.ramcosta.composedestinations.spec.DestinationSpec

public annotation class _Info_01bcf6da_b543_4bbf_ad55_a428d071ca8b(
    val moduleName: String,
    val packageName: String,
    val hasNavArgsPackage: Boolean,
    val typeResults: Array<_Destination_Result_Info_01bcf6da_b543_4bbf_ad55_a428d071ca8b> = emptyArray(),
    val topLevelGraphs: Array<String> = emptyArray()
)

public annotation class _Destination_Result_Info_01bcf6da_b543_4bbf_ad55_a428d071ca8b(
    val destination: String,
    val resultType: String,
    val resultNavType: String,
    val isResultNullable: Boolean
)

@_Info_01bcf6da_b543_4bbf_ad55_a428d071ca8b(
    moduleName = "",
    packageName = "com.ramcosta.composedestinations.generated",
    hasNavArgsPackage = true,
    typeResults = [
       _Destination_Result_Info_01bcf6da_b543_4bbf_ad55_a428d071ca8b(
           destination = "com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestination",
           resultType = "kotlin.Boolean",
           resultNavType = "com.ramcosta.composedestinations.navargs.primitives.booleanNavType",
           isResultNullable = false
       )
    ],
    topLevelGraphs = [
		"RootNavGraph"
    ]
)
public object _ModuleRegistry_01bcf6da_b543_4bbf_ad55_a428d071ca8b