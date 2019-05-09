const state = {
    title: '',
    editorKey: 0,
    otherCollaborators: []
};

const getters = {

};

const actions = {

};

const mutations = {
    setTitle: (state, newValue) => {
        state.title = newValue
    },
    setOtherCollaborators: (state, newValue) => {
        state.otherCollaborators = newValue
    },
    addCollaborator: (state, name) => {
        for (let i = 0; i < state.otherCollaborators.length; i++) {
            if (state.otherCollaborators[i] === name) {
                return
            }
        }
        state.otherCollaborators.push(name)
    },
    removeCollaborator: (state, name) => {
        for (let i = 0; i < state.otherCollaborators.length; i++) {
            if (state.otherCollaborators[i] === name) {
                state.otherCollaborators.splice(i, 1)
                return
            }
        }
    },
    incEditorKey: (state) => {
        state.editorKey++
    }
};

export default {
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}
