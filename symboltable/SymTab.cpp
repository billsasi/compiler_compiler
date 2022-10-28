#include "SymTab.hpp"
#include <iostream>
#include <iomanip>

SymTab::SymTab() {
    table = std::unordered_map<std::string, SymTabNode>();
}

SymTab::~SymTab() {
    table.clear();
}

void SymTab::insert(std::string name) {
    if (lookup(name) == -1) {
        table.insert({name, SymTabNode(name, "int")});
    }
}

int SymTab::lookup(std::string name) {
    if (table.find(name) != table.end()) {
        return 1;
    }
    return -1;
}

void SymTab::output(std::ostream& os) {
    for (auto it = table.begin(); it != table.end(); it++) {
        os << std::setw(20) << std::left << it->first << std::setfill(' ') << it->second.getType() << std::endl;
    }
}
