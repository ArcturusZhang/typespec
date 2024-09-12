// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armresourceprovider.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.cadl.armresourceprovider.fluent.TopLevelArmResourceInterfacesClient;
import com.cadl.armresourceprovider.fluent.models.ResultInner;
import com.cadl.armresourceprovider.fluent.models.TopLevelArmResourceInner;
import com.cadl.armresourceprovider.models.Result;
import com.cadl.armresourceprovider.models.TopLevelArmResource;
import com.cadl.armresourceprovider.models.TopLevelArmResourceInterfaces;

public final class TopLevelArmResourceInterfacesImpl implements TopLevelArmResourceInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(TopLevelArmResourceInterfacesImpl.class);

    private final TopLevelArmResourceInterfacesClient innerClient;

    private final com.cadl.armresourceprovider.ArmResourceProviderManager serviceManager;

    public TopLevelArmResourceInterfacesImpl(TopLevelArmResourceInterfacesClient innerClient,
        com.cadl.armresourceprovider.ArmResourceProviderManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<TopLevelArmResource> getByResourceGroupWithResponse(String resourceGroupName,
        String topLevelArmResourceName, Context context) {
        Response<TopLevelArmResourceInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, topLevelArmResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new TopLevelArmResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TopLevelArmResource getByResourceGroup(String resourceGroupName, String topLevelArmResourceName) {
        TopLevelArmResourceInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, topLevelArmResourceName);
        if (inner != null) {
            return new TopLevelArmResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String topLevelArmResourceName) {
        this.serviceClient().delete(resourceGroupName, topLevelArmResourceName);
    }

    public void delete(String resourceGroupName, String topLevelArmResourceName, Context context) {
        this.serviceClient().delete(resourceGroupName, topLevelArmResourceName, context);
    }

    public PagedIterable<TopLevelArmResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<TopLevelArmResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopLevelArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopLevelArmResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<TopLevelArmResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopLevelArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopLevelArmResource> list() {
        PagedIterable<TopLevelArmResourceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopLevelArmResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TopLevelArmResource> list(Context context) {
        PagedIterable<TopLevelArmResourceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new TopLevelArmResourceImpl(inner1, this.manager()));
    }

    public Result action(String resourceGroupName, String topLevelArmResourceName) {
        ResultInner inner = this.serviceClient().action(resourceGroupName, topLevelArmResourceName);
        if (inner != null) {
            return new ResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Result action(String resourceGroupName, String topLevelArmResourceName, Context context) {
        ResultInner inner = this.serviceClient().action(resourceGroupName, topLevelArmResourceName, context);
        if (inner != null) {
            return new ResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TopLevelArmResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, topLevelArmResourceName, Context.NONE).getValue();
    }

    public Response<TopLevelArmResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, topLevelArmResourceName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        this.delete(resourceGroupName, topLevelArmResourceName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String topLevelArmResourceName = ResourceManagerUtils.getValueFromIdByName(id, "topLevelArmResources");
        if (topLevelArmResourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'topLevelArmResources'.", id)));
        }
        this.delete(resourceGroupName, topLevelArmResourceName, context);
    }

    private TopLevelArmResourceInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.cadl.armresourceprovider.ArmResourceProviderManager manager() {
        return this.serviceManager;
    }

    public TopLevelArmResourceImpl define(String name) {
        return new TopLevelArmResourceImpl(name, this.manager());
    }
}
